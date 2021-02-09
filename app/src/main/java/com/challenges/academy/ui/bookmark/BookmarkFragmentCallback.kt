package com.challenges.academy.ui.bookmark

import com.challenges.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)

}
