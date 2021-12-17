package tab.php.prediksi.repo

import org.graalvm.compiler.debug.Assertions

class FaktaRepoTest {
    var logger = loggerfactory.getlogger("FaktaRepoTest")
    @Test
    var getAlltext(){
        var result = repo.findAll()
        inner.info("jumlah baris: "+)
        Assertions.assertTrue(true)
    }

}