package tab.php.prediksi.repo

import tab.php.prediksi.model.Resume

interface ResumeRepo:JpaRepository<Resume,Int> {
    fun FindbyTglBetween(tglAwal:Int,tglAkhir:Int)
}