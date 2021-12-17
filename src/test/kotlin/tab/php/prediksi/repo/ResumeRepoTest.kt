package tab.php.prediksi.repo
import com.sun.org.slf4j.internal.LoggerFactory
import tab.php.prediksi.repo.ResumeRepo
@SpringBootTest
class ResumeRepoTest {
    @Autourized
    lateinit var repo:ResumeRepo
    var log= LoggerFactory.getLongger("ResumeRepoTest")
    @Test
    fun findByTglBeetweenTest(){
        val result =repo.findByTglBetween(200523,200524)

    }
}