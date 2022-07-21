package com.happy.weather.ui.Today

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.happy.weather.R
import com.happy.weather.databinding.FragmentTodayBinding

class TodayFragment : Fragment() {

    private var _binding: FragmentTodayBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
        // enabling webview
    ): View {
        val view: View = inflater!!.inflate(R.layout.fragment_today, container, false)
        val web = view.findViewById(R.id.today_web) as WebView
        web.apply {
            loadUrl("https://www.accuweather.com/en/ug/kampala/318416/weather-forecast/318416");
            webViewClient = WebViewClient();
            settings.javaScriptEnabled = true
        }
        return view

    }

}