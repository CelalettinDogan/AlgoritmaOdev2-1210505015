Hoorspool Algoritması
Amacı nedir ne için kullanılır?
Horspool algoritması, bir metin içinde verilen bir stringi bulmak için kullanılan bir arama algoritmasıdır. 
Bu algoritma, özellikle büyük metinlerde performansı yüksek olduğu için, metin içindeki bir stringin bulunması gereken durumlarda tercih edilebilir.

Nasıl çalışır?
Horspool algoritması, stringi bulmak için geriye doğru bir adım atlayan ve bulunan bir stringin olası konumlarını önceden hesaplayarak bu konumları araştıran bir yöntemdir.
Stringin bulunması durumunda, stringin bulunduğu pozisyonu döndürür ve aksi takdirde stringin metin içinde bulunmadığını belirtmek için bir değer döndürür.

Çalışma zamanı	
Horspool algoritmasının çalışma zamanı, string uzunluğuna (m) ve metin uzunluğuna (n) bağlıdır.
En kötü durumda, algoritma tüm metin boyunca bir karakter kaydırarak çalışacaktır. Bu durumda, çalışma zamanı O(mn) olacaktır.
Örneğin, string "ABC" ve metin "AAAAAAAAAAAAAAAAAB" olduğunda, algoritma en son karaktere kadar tüm metin boyunca bir karakter kaydırarak çalışacaktır.
En iyi durumda, string metinde hiçbir yere uymuyor olabilir. Bu durumda, algoritmanın çalışma zamanı O(n) olacaktır.
Ortalama durumda, Horspool algoritması O(n/m) çalışma zamanı ile birlikte stringi metin içinde arayabilir. Bu, stringin uzunluğuna bağlı olarak değişebilir ve özellikle büyük metinlerde performans açısından avantajlıdır.
Horspool algoritmasının çalışma zamanı, karakter tablosunun oluşturulması ve metnin üzerindeki string kaydırması işlemi ile belirlenir. Karakter tablosunun oluşturulması O(m) zaman alır.
Metin üzerindeki string kaydırması, en kötü durumda tüm metin boyunca bir karakter kaydırarak yapılır ve bu da O(n) zaman alır. Ancak, karakter tablosu kullanılarak yapılan string kaydırma işlemi, bir karakter kaydırma işlemi için O(1) zaman alır.
Bu nedenle, karakter tablosunun oluşturulması ve metnin üzerindeki string kaydırma işlemleri, toplamda O(m+n) zaman alır.







KARGER ALGORİTMASI
Ne için kullanılır?
Karger algoritması, bir grafın min-cut'ını (minimum kesim) bulmak için kullanılan bir olasılık algoritmasıdır. Bu algoritma, grafın düğüm ve kenar sayısı n kadar olduğunda, O(n^2) zaman karmaşıklığına sahip olduğu için büyük veri kümeleri için oldukça etkilidir.
Algoritmanın temel amacı, verilen bir grafın min-cut'ını bulmaktır. Min-cut, bir grafın iki parçaya ayrılabileceği en az kenar sayısıdır. 
Graf, iki farklı parçaya ayrıldığında, bu iki parça birbirleriyle hiçbir şekilde bağlantılı olmamalıdır. Bu şekilde, grafın birbirinden ayrılmış en küçük parçalara ayrılması sağlanır.
Karger algoritması, grafın min-cut'ını bulmak için iteratif bir yaklaşım kullanır. Her bir iterasyonda, grafın rastgele seçilen bir kenarı silinir ve graf, iki farklı parçaya ayrılır.
Ardından, bu iki parça üzerinde algoritma tekrar çalıştırılır. Bu işlem, grafın min-cut'ını bulana kadar tekrarlanır. Algoritmanın çıkışı, min-cut'ı veren iki parça olarak belirlenir.
Karger algoritması, özellikle büyük veri kümeleri için oldukça etkili bir yöntemdir. Bu algoritma, sosyal ağ analizi, bilgisayar ağları ve genetik araştırmalar gibi birçok farklı uygulama alanında kullanılmaktadır.

Çalışma şekli
*Graf, her bir düğümün kendine ait bir kümede olduğu şekilde başlatılır.
*Rastgele bir kenar seçilir ve bu kenarın iki ucu arasındaki düğümlerden biri kümeden diğerine taşınarak graf iki parçaya ayrılır.
*İki parçaya ayrılan graf üzerinde adım 2 tekrarlanır.
*Adımlar 2 ve 3, grafın sadece iki düğüm kaldığında durdurulur.
*Algoritma, min-cut'ı veren iki parçayı belirler ve çıkış olarak bu iki parçayı verir

Çalışma zamanı analizi
Karger algoritması, grafın boyutuna (n) ve kenar sayısına (m) bağlı olarak farklı zaman karmaşıklıklarına sahiptir.
En kötü durumda, algoritma O(n^2) zaman karmaşıklığına sahiptir. Bu durum, her zaman yanlış kenarların seçilmesi ve grafın tüm düğümlerinin birbirleriyle bağlantılı olması durumunda meydana gelir. Ancak bu durum nadir görülür.
Ortalama durumda, Karger algoritması O(m * log(n)) zaman karmaşıklığına sahiptir. Bu karmaşıklık, grafın yapısına bağlı olarak değişebilir ve bazı durumlarda daha iyi performans gösterebilir.
En iyi durumda, Karger algoritması O(m) zaman karmaşıklığına sahiptir. Bu durum, grafın min-cut'ını oluşturan kenarların rastgele seçilmesi ve algoritmanın ilk adımda doğru seçim yapması durumunda gerçekleşir. Ancak bu durum da nadir görülür.
Karger algoritmasının zaman karmaşıklığı, her adımda grafın boyutunun n/2'ye düştüğü göz önüne alındığında, algoritmanın toplam çalışma zamanı O(n^2 * log(n))'dir. Ancak, algoritmanın rastgele seçimler yaparak çalışması nedeniyle, pratikte genellikle çok daha hızlı sonuçlar verir. Bu nedenle, Karger algoritması büyük veri kümeleri için oldukça etkilidir.






