package com.happy.weather.ui.home

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
import com.happy.weather.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
        // enabling webview
    ): View {
        val view: View = inflater!!.inflate(R.layout.fragment_home, container, false)
        val myWeb = view.findViewById(R.id.web) as WebView
        myWeb.apply {
            loadUrl("https://www.accuweather.com/");
            webViewClient = WebViewClient();
            settings.javaScriptEnabled = true
        }
        return view

    }

}