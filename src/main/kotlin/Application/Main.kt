package Application

import BD.SessionOracle
import Bean.employe
import DAO.DAOEmploye

fun main(args: Array<String>) {
    var essai= SessionOracle();

    essai.getConnectionOracle()
    var zackary = employe(10, "zackary", 1, 35, 18000)

    var dd= DAOEmploye(essai)
    dd.create(zackary)
    dd.read()


}