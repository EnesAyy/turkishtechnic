<strong>UI ve Recyclerview kullanımı</strong>

Ürünleri çekmek için recycylerview kullandım mainactivity.xml sayfamda ve bu ürünleri recyclerviewe göndermek için de item_product.xml adlı sayfamı oluşturdum. Ürünleri cardview kullanarak aktarmak istedim.Bunlar için adapter oluşturdum ve kullanmak istediğim verileri buralara aktardım.

<strong>Retrofit ile Api isteği ve Gsonconventory</strong>

Ürünler data class'ımı da oluşturduktan sonra gerekli kütüphaneleri ekledikten sonra gerekli retrofit nesnemi oluşturdum ve bu nesne için bir api arayüzü oluşturdum ve verileri api aracılığıyla çekme işlemini gerçekleştirdim.
Gsonconvertory de kullanarak api üzerinden almış olduğumuz json verileri de kolay bir şekilde kotlin nesneleri olmuş oldu.

<strong>Repository</strong>

Api çağrılarını yönetmek için repository sınıfı oluşturdum ve gerekli kodlamalarımı yaptıktan sonra ViewModel modeline verilerimi sağlamak için ViewModel oluşturdum ve bu viewmodel için bir ViewModelFactory oluşturdum.

<strong>MVVM ve Livedata</strong>

Bu sayfada repositoryden gelen verileri aldım ve artık ui bileşenime geldiğim için livedata kullanımı da bu sayfada gerçekleştirdim ve artık ui bileşenlerim veri değişikliğine gittiğinde otomatik güncellemesini de sağlamış olduk.
ViewModelden aldığımız verileri ise mainactivityde kullanarak verilerimizi başarılı bir şekilde listelemiş olduk



