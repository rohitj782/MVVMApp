package rohitrj.com.mvvmapp.ui.auth

interface AuthListener {

    fun onStarted()
    fun onSuccess()
    fun OnFailure(message:String)
}