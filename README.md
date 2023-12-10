# ButtonControlPanelApp.java

Kod Nasıl Kullanılır ve Test Edilir:
Java Kurulumu:
Öncelikle, bilgisayarınızda Java'nın yüklü olması gerekmektedir. Oracle veya OpenJDK web sitelerinden Java'nın en son sürümünü indirebilir ve yükleyebilirsiniz.

Java Kodunun Derlenmesi:
Yukarıda verilen Java kodunu bir metin düzenleyici (örneğin, Notepad, Visual Studio Code, IntelliJ IDEA) kullanarak bir dosyaya yapıştırın ve .java uzantısı ile kaydedin (örneğin, ButtonControlPanelApp.java).
Ardından, terminal veya komut istemcisini açın ve kodun bulunduğu dizine gidin.

Java Uygulamasını Çalıştırma:
Derleme başarılı olduğunda, aynı dizinde ButtonControlPanelApp.class adında bir dosya oluşacaktır.

Butonları Test Etme:
Penceredeki her bir butona tıklayarak butonların davranışını gözlemleyin.
Butonlara tıklanması durumunda konsol çıktısında "Running GraphQL Mutation..." ifadesinin göründüğünü göreceksiniz. Bu, butona tıklanması durumunda çağrılan GraphQL mutasyonunu simüle eden bir mesajdır.
Eğer GraphQL bağlantısı yapmak istiyorsanız, runGraphQLMutation metodunu kendi GraphQL bağlantı mantığınız ile doldurmalısınız.
Dilerseniz, kod içindeki yorum satırlarını ve görselleri (icon path'lerini) projenizin ihtiyaçlarına göre özelleştirebilirsiniz.

Uygulamayı Kapatma:
Uygulamayı kapatmak için pencerenin üstündeki kapatma düğmesini (genellikle bir X işareti) kullanabilir veya terminal penceresini kapatabilirsiniz.
Bu adımları takip ederek, Java Swing uygulamanızı başarıyla kullanabilir ve test edebilirsiniz.



GraphQL Nedir ?

GraphQL, API'ler ( Application Programming Interface, Uygulama Programlama Arabirimi) için açık kaynaklı bir veri sorgulama ve işleme dili ve bu sorguları yerine getirmek için yazılmış uygulamalardır. 
Başka bir deyişle GraphQL, verileri istemeyi açıklayan bir sentakstır ve genelde sunucudaki verileri bir istemciye yüklemek için kullanılır. 
GraphQL üç ana özelliğe sahiptir:
1.İstemcinin ihtiyaç duyduğu verilerin tam olarak belirtilmesini sağlar.
2.Birden fazla kaynaktan veriye ulaşmanızı kolaylaştırır.
3.Veriyi açıklamak için bir tür sistem kullanır.

GraphQL, web API'leri geliştirmek için bir yaklaşım sağlar. Bu özelliğiyle REST ve diğer web hizmeti mimarileriyle karşılaştırılabilir. 
GraphQL, istemcilerin talep ettikleri verilerin yapısını tanımlamasına olanak tanır ve veriler tanımlanan yapıda sunucudan döndürülür. 
Bu, aşırı büyük miktarda verinin döndürülmesini engeller ve sorgu sonuçlarının web'de önbelleğe alınmasını sekteye uğratabilir. 
Sorgu dilinin esnekliği ve zenginliği, basit API'ler için harcanılan efora değmeyecek kadar karmaşık olabilir.

Uygulamada, bir GraphQL API’si üç temel yapı etrafında düzenlenmiştir: şema, sorgular ve resolvers.
Sorgular : GraphQL asistanınıza bulunduğunuz talep bir sorgudur.
Resolvers : Benzer olarak, GraphQL sunucusu da ona bir resolver kullanmasını söylemediğiniz sürece gelen sorgu ile ne yapacağını bilemeyecektir. 
Bir resolver, GraphQL’e belirli bir alana karşılık gelen verileri nasıl ve nereden alacağını söyler.
Şema : Tüm bu yararlı şeyler GraphQL’in şema sistemi tarafından mümkün kılınmıştır.

Rest ve Rest API Nedir?
Rest (Representational State Transfer), Server (Sunucu) ve Client (İstemci) arasında veri alışverişini sağlayan bir mimari modeldir. 
Rest API de Rest mimarisinin kullanımıyla web hizmetleri arasında veri alışverişini sağlayan uygulama ara birimidir.

GraphQL ile REST arasındaki benzerlikler nelerdir?
Hem GraphQL hem de REST, bir istemci-sunucu modelindeki farklı hizmetler veya uygulamalar arasında veri değişimini sağlayan popüler API mimarisi stilleridir.
API'ler, veri erişimini ve şunlar gibi veri işlemlerini kolaylaştırır:
İstemci, sunucudaki bir veya birden çok uç noktaya API isteği gönderir.
Sunucu; veri, veri durumu veya hata kodları içeren bir yanıt verir.
REST ve GraphQL, API aracılığıyla ayrı bir uygulama, hizmet veya modül üzerinde veri oluşturmanıza, değiştirmenize, güncellemenize ve silmenize olanak tanır. 
REST ile geliştirilen API'ler, RESTful API'ler veya REST API'ler olarak bilinir. GraphQL ile geliştirilenler sadece GraphQL API'leridir.

GraphQL ile REST Arasındaki Fark Nedir?
GraphQL ve REST, internet üzerinden veri değişimi için API tasarlamaya yönelik iki farklı yaklaşımdır. 
REST, istemci uygulamalarının internetin standart iletişim protokolü olan HTTP fiillerini kullanarak bir sunucuyla veri değişimi yapmasını sağlar. 
Öte yandan GraphQL, bir istemci uygulamasının uzak bir sunucudan nasıl veri istemesi gerektiğine ilişkin teknik özellikleri tanımlayan bir API sorgu dilidir. 
İsteği tanımlamak için sunucu tarafı uygulamaya bağlı kalmadan API çağrılarınızda GraphQL'yi kullanabilirsiniz. GraphQL ve REST, modern uygulamalarımızın çoğunun arkasındaki güçlü teknolojilerdir.

GraphQL Avatanjları:
1. Sadece Gerekli Kolonları Sorgulayabilmek
Bir backend geliştirdiğimizi düşünelim. Bu backend'i kullanacak olan bir mobil uygulama ve bir de web uygulaması geliştirdiğimizi ve anasayfada kullanıcı postlarını listelememiz gerektiğini varsayalım.
Ancak bu postları listelerken web uygulamasında id, username, description, created date, comments gibi alanları göstermemiz gerekirken mobil uygulama tarafında sadece id, username ve description kolonlarına ihtiyacımız olduğunu varsayalım.
Eğer bu backend'i Rest API olarak geliştirseydik anasayfadaki postların sahip olduğu tüm kolonlar db üzerinde select edilecekti. 
Ancak biz mobil uygulama tarafında sadece iki kolona ihtiyaç duyuyoruz. Böyle olmasına rağmen yine de o ihtiyacımız olmayan veriler API'dan bize gelmek durumundaydı.
Ama eğer bunu GraphQL ile yapsaydık böyle bir zorunluluğumuz olmayacaktı. Çünkü GraphQL ile sadece istediğimiz alanlar için özel Query'ler yazabiliriz.
2. Tek bir API Endpoint
Eğer backend'i REST ile geliştiriyor olsaydık oluşturmamız gereken onlarca farklı endpoint olacaktı. Sisteme kayıtlı kullanıcılar, bu kullanıcıların gönderileri ve bu gönderilere ait yorumların olduğunu varsayalım. 
Bu liste daha da uzar gider elbette. Kullanıcı, gönderi veya yorumlar için ekleme, silme, güncelleme gibi.
O endpointlerin de diğer HTTP metodları(POST,UPDATE,DELETE) ile yazılması gerekir.
Ancak işin GraphQL tarafına baktığımız zaman böyle bir endpoint karmaşası ile uğraşmanız gerekmiyor. 
GraphQL tarafında istekleri bekleyen tek bir endpoint sizi karşılıyor. Tüm isteklerimizi buraya yapmamız gerekiyor. Ve aynı Query içerisinde birden fazla veriyi getirme imkanınız da var.
3. İlişkili Veriler
GraphQL ilişkili veriler ile çalışırken çok büyük kolaylıklar sağlar. Sistemde bulunan tüm kullanıcıları, her bir kullanıcının sahip olduğu gönderileri ve bu gönderilere ait yorumları listeler.
4. Otomatik Dokümanlama
GraphQL şemalarınızı tasarlamaya başladığınız anda sizin için otomatik olarak dokümanlar oluşturulur. Bu dokümanlar API'ı implemente edecek olan frontend geliştiricinin ihtiyaç duyduğu tek şeydir.
Bu dokümanı inceleyerek hızlıca implementasyon yapmaya başlayabilir. Artık dokümanlama için de ekstra efor sarf etmenize gerek yoktur.
