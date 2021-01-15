package model

import Adapter.StudentAdapter
import FRagment.ViewFragment

val listStudent: ArrayList<Students> =  ArrayList()
val adapter = StudentAdapter(listStudent, ViewFragment())

fun add(){ listStudent.add(Students("Smriti Kafle",
    21,
    "Pepsicola",
    "Female",
    "https://www.pngitem.com/pimgs/m/110-1104775_user-woman-business-woman-png-icon-transparent-png.png"))
    listStudent.add(Students(
        "Joey Tribbiani",
        23,"New York",
        "Male",
        "https://cdn.onlinewebfonts.com/svg/img_504768.png"))
    listStudent.add(Students("Rachel Green",
        24,
        "female",
        "Manhatten",
        "https://www.pngitem.com/pimgs/m/110-1104775_user-woman-business-woman-png-icon-transparent-png.png"))}

