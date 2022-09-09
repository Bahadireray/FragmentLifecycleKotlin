# FragmentLifecycleKotlin
## Activity Fragment Lifecycle

![Fragment](https://user-images.githubusercontent.com/57098047/189314742-07445ffb-8392-4d3d-ad91-06afbd5eee19.gif)


### Bu kısa örnekte sizlere Fragment Lifecycle yani fragment yaşam döngüsüyle ilgili açıklamada bulunacağım.
Bir zamanlar herkes Temple Run oynamıştır. Uygulama içerisinde biraz oynayıp çıktığımızı ve hatta arka planda uygulamayı kapatsak bile bıraktığımız yerde ve bıraktığımız skorda oyunun açıldığını görmüşüzdür. Bunu mobil uygulamanın içerisindeki yaşam döngüleriyle mümkün olacaktır. Şimdi basit bir sayaç uygulamasıyla sizlere bunu anlatmış olacağım. 

### Fragment Lifecycle onViewStateRestored 
Uygulama açıldığı zaman yaşam döngüsünün içerisinde çağırılan metotların arasında onViewStateRestored bulunuyor. Bu metotun içinde geri yüklenmesini istediğimiz işlemleri içerisine yazabiliriz. Uygulama açılır açılmaz çağrılacağı için yapmış olduğumuz işlemleri kaldığı yerden göreceğiz.


### Fragment Lifecycle onSaveInstanceState 
Uygulamayı öldürmeyi yani kapatmayı ele aldığımız zaman hatta kapatmasak bile uygulamaları görüntületiğimiz menüye bile gelsek yaşam döngüsü bunu kapatmayı düşündüğümüzü ele alır ve onSaveInstanceState bu metotu çağırır. Bu metot içerisinde uygulamayı tekrar açtığımız ne görmek istiyorsak içerisinde işlemlerimizi içine yazıyoruz.

### Aşağıda Fragment Lifecycle Tüm Döngülerini görebilirsiniz. Bunları Araştırıp uygulamanıza uygunluğuna göre entegre etmenizi öneririm.
 
![image](https://user-images.githubusercontent.com/57098047/189316474-6924319b-b011-4ba3-a42c-c95f0bfc5f8d.png)
