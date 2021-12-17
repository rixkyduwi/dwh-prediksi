package tab.php.prediksi.model
@Entity
@Table(name='fakta')
class Fakta {
    @id @column(name='id')
    var id:Int,
    @Column (name='amount')
    var amount:Double,
    @Column (name='sk_files')
    var sk_files:Int,
    @Column (name='sk_staf')
    var sk_staf:Int,
    @Column (name:'sk_waktu')
    var sk_waktu:Int
}