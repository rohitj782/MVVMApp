package rohitrj.com.mvvmapp.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import rohitrj.com.mvvmapp.R
import rohitrj.com.mvvmapp.databinding.ActivitySignInBinding
import rohitrj.com.mvvmapp.util.toast

class SignInActivity : AppCompatActivity(),AuthListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivitySignInBinding= DataBindingUtil.setContentView(this,R.layout.activity_sign_in)

        val viewModel = ViewModelProviders.of(this).get(AuthViewModel::class.java)

        binding.myViewModel=viewModel

        viewModel.authListener = this
    }

    override fun onStarted() {

        toast("Started")
    }

    override fun onSuccess() {
        toast("Success")
    }

    override fun OnFailure(message: String) {

        toast(message)
    }

}
