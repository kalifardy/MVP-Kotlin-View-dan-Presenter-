package com.app.keyalive.simplemvpkotlin

/**
 * Created by keyalive on 17/02/2018.
 */
class MainPresenter {
    var mainView : MainView? = null

    constructor(mainView: MainView?) {
        this.mainView = mainView
    }

    fun logicView(input:String){
//        kondsional Check
        if (input.isEmpty()){
            mainView?.Salah()
        }else{
            mainView?.Sucsses()
        }

    }

}