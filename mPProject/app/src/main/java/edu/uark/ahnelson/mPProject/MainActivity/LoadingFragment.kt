package edu.uark.ahnelson.mPProject.MainActivity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import edu.uark.ahnelson.mPProject.R
import androidx.fragment.app.FragmentManager.POP_BACK_STACK_INCLUSIVE


class LoadingFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_loading, container, false)

        //defines exit animation
        val exitAnimation = AnimationUtils.loadAnimation(activity, R.anim.fade_out)
        //exitAnimation behavior
        exitAnimation.setAnimationListener(object: Animation.AnimationListener{
            override fun onAnimationRepeat(animation: Animation?) {
                //no need to implement
            }
            //removes fragment from the backstack
            override fun onAnimationEnd(animation: Animation?){
                activity?.supportFragmentManager?.popBackStack("loadingFragment", POP_BACK_STACK_INCLUSIVE)
            }

            override fun onAnimationStart(animation: Animation?) {
                //no need to implement
            }
        })
        return root
    }
}