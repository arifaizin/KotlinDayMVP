package id.hamasah.kotlindaymvp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {


    //deklarasi presenter
    lateinit var presenter: MainPresenter
    // late init --> gantinya = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()
        initView()
    }

    private fun initView() {
        btnMasukan.setOnClickListener {
            presenter.logicView(ed_isian.text.toString())

            //// aslinya
//            if (ed_isian.text.toString().isEmpty()){
//                Toast.makeText(this, "Input Kosong", Toast.LENGTH_SHORT).show()
//            } else{
//                Toast.makeText(this, "Sukses", Toast.LENGTH_SHORT).show()
//            }
        }
    }

    private fun initPresenter() {
        presenter = MainPresenter(this);
    }

    override fun Sukses() {
        Toast.makeText(this, "Sukses", Toast.LENGTH_SHORT).show()
    }

    override fun Salah() {
        Toast.makeText(this, "Input Kosong", Toast.LENGTH_SHORT).show()

    }
}
