package id.ac.polbeng.gentaindianaluthfi.threadexample3

import android.util.Log

class ExampleRunnable(private var seconds: Int) : Runnable {

    companion object {
        private const val TAG = "MainActivity"
    }

    override fun run() {
        for (i in 1 until seconds) {
            Log.d(TAG, "startThread: $i")
            try {
                Thread.sleep(1000)
            } catch (ie: InterruptedException) {
                ie.printStackTrace()
            }
        }
    }
}