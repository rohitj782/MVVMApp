package rohitrj.com.mvvmapp.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {

    var email: String? = null
    var password: String? = null
    var authListener: AuthListener? = null

    fun onLoginButtonClick(view: View){

        authListener?.onStarted()
        
        if(password.isNullOrEmpty()||email.isNullOrEmpty()){
            authListener?.OnFailure("Enter Details!")
            return
        }

        authListener?.onSuccess()
    }

}