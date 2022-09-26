package com.hanjw.cleanarchitecturepract.base

import android.os.Bundle
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import java.time.Instant

abstract class BaseActivity<T : ViewDataBinding>(@LayoutRes private val layoutResId: Int) : AppCompatActivity() {
    protected lateinit var binding:T
    private var waitTime = 0L

    override fun onCreate(savedInstantState: Bundle?) {
        super.onCreate(savedInstantState)
        binding = DataBindingUtil.setContentView(this, layoutResId)
        init()
    }

    abstract fun init()

    override fun onBackPressed() {
        if (System.currentTimeMillis() - waitTime > 1500) {
            waitTime = System.currentTimeMillis()
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
        } else finish()
    }

    protected fun shortShowToast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

    protected fun longShowToast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
}
