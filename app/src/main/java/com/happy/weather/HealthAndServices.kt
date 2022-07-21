package com.happy.weather

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.happy.weather.databinding.FragmentHealthAndServicesBinding
import com.happy.weather.databinding.FragmentHomeBinding

class HealthAndServices : Fragment() {

    private var _binding: FragmentHealthAndServicesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

        // enabling webview
    ): View {
        val view: View = inflater!!.inflate(R.layout.fragment_health_and_services, container, false)
        val myWeb = view.findViewById(R.id.web_health) as WebView
        myWeb.apply {
            loadUrl("https://www.accuweather.com/en/ug/makerere/318414/health-activities/318414");
            webViewClient = WebViewClient();
            settings.javaScriptEnabled = true
        }
        return view

    }

}