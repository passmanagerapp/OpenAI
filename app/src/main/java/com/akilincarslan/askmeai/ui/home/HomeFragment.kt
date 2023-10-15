package com.akilincarslan.askmeai.ui.home

import com.akilincarslan.askmeai.R
import com.akilincarslan.askmeai.core.BaseInjectionFragment
import com.akilincarslan.askmeai.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment :BaseInjectionFragment<FragmentHomeBinding,HomeViewModel>() {

    override fun getLayoutRes(): Int = R.layout.fragment_home
    override fun getViewModelClass(): Class<HomeViewModel> = HomeViewModel::class.java

}