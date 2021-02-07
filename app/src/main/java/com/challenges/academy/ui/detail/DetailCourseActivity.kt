package com.challenges.academy.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.challenges.academy.R
import com.challenges.academy.databinding.ActivityDetailCourseBinding
import com.challenges.academy.databinding.ContentDetailCourseBinding

class DetailCourseActivity : AppCompatActivity() {

    private lateinit var detailContentBinding: ContentDetailCourseBinding


    companion object {
        const val EXTRA_COURSE = "extra_course"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDetailCourseBinding = ActivityDetailCourseBinding.inflate(layoutInflater)
        detailContentBinding = activityDetailCourseBinding.detailContent

        setContentView(activityDetailCourseBinding.root)
        setSupportActionBar(findViewById(R.id.toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}