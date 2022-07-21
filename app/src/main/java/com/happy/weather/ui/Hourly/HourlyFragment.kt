package com.happy.weather.ui.Hourly

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
import com.happy.weather.databinding.FragmentHourlyBinding

class HourlyFragment : Fragment() {

    private var _binding: FragmentHourlyBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
        // enabling webview
    ): View {
        val view: View = inflater!!.inflate(R.layout.fragment_hourly, container, false)
        val Web = view.findViewById(R.id.hourly_web) as WebView
        Web.apply {
            loadUrl("https://www.accuweather.com/en/ug/kampala/318416/hourly-weather-forecast/318416");
            webViewClient = WebViewClient();
            settings.javaScriptEnabled = true
        }
        return view

    }

}