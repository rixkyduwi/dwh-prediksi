package tab.php.prediksi.util

import tab.php.prediksi.model.Resume

@Component
class LeastSquare {
    companion object{
        fun converTglToInt(tgl:String):Int{
            val result = tgl.substring(0,4)+tgl.substring(5,7)+
                    tgl.substring(0,10)
            return Integer.parseInt(result)
        }
        fun genereteX(data:){

        }
        //menghitung apabila jumlah item Y nya genap//
        fun genereteXEven(jmlData: List<Resume>):List<Int>{
            val start =Integer (jmlData.size/2) - jmlData.size+1
            var result = mutableListOf<Int>()
            var i=0
            data.forEach{
                result.add(start++)
            }
        }
        fun calculateA (data: List<Resume>):Double{

        }
fun
    }
}