package id.hamasah.kotlindaymvp

/**
 * Created by idn on 2/17/2018.
 */
class MainPresenter {

    var mainView : MainView? = null

    constructor(mainView: MainView?) {
        this.mainView = mainView
    }

    fun logicView(input : String) {
        //cek kosong>
        if (input.isEmpty()){
            mainView?.Salah();
        } else {
            mainView?.Sukses()
        }

        //? null atau not null
        // !! try catch
    }
}