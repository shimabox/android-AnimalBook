package net.shimabox.animalbook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.shimabox.animalbook.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 * Use the [TitleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TitleFragment : Fragment() {
    private var _binding: FragmentTitleBinding? = null
    private val binding get() = _binding!! // !! => 二重感嘆符演算子(非null表明演算子)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTitleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun setTitle(title: String) {
        binding.titleText.text = title
    }
}