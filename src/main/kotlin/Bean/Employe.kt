package Bean

class employe(nuempl : Int, nomempl : String, hebdo : Int, affect : Int, salaire : Int) {
    private var nuempl : Int
    private var nomempl : String
    private var hebdo : Int
    private var affect : Int
    private var salaire : Int

    init {
        this.nuempl = nuempl
        this.nomempl = nomempl
        this.hebdo = hebdo
        this.affect = affect
        this.salaire = salaire
    }

    override fun toString(): String {
        return "$nuempl , $nomempl"
    }

    fun getNuempl() : Int{
        return nuempl
    }

    fun getNomempl() : String{
        return nomempl
    }

    fun setNuempl(newNuempl : Int) {
        nuempl = newNuempl
    }

    fun setNomempl(newNomempl : String) {
        nomempl = newNomempl
    }

    fun getHebdo() : Int{
        return hebdo
    }

    fun setHebdo(newHebdo : Int) {
        nuempl = newHebdo
    }

    fun getAffect() : Int{
        return affect
    }

    fun setAffect(newAffect : Int) {
        nuempl = newAffect
    }

    fun getSalaire() : Int{
        return salaire
    }

    fun setSalaire(newSalaire : Int) {
        nuempl = newSalaire
    }
}