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
        fun genereteXEven(data: List<Resume>):List<Int>{
            val start =Integer (data.size/2) - data.size+1
            var result = mutableListOf<Int>()
            data.forEach{
                result.add(start++)
            }
        }
        fun calculateA (data: List<Resume>):Double{

        }

    }
}