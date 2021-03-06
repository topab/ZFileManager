package com.zp.z_file.type

import android.view.View
import android.widget.ImageView
import com.zp.z_file.common.ZFileType
import com.zp.z_file.content.getZFileHelp
import com.zp.z_file.content.toFile

open class VideoType : ZFileType() {

    override fun openFile(filePath: String, view: View) {
        getZFileHelp().getOpenListener().openVideo(filePath, view)
    }

    override fun loadingFile(filePath: String, pic: ImageView) {
        getZFileHelp().getImageLoadListener()?.loadImage(pic, filePath.toFile())
    }
}