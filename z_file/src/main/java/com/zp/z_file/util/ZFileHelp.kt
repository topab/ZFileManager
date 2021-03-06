package com.zp.z_file.util

import com.zp.z_file.common.ZFileTypeManage
import com.zp.z_file.content.getFileType
import com.zp.z_file.content.toFile

/**
 * 对外工具类
 */
object ZFileHelp {

    /**
     * 获取文件大小
     */
    fun getFileSize(filePath: String) = ZFileUtil.getFileSize(filePath.toFile().length())

    /**
     * 获取文件类型
     */
    fun getFileType(filePath: String) = ZFileTypeManage.getTypeManager().getFileType(filePath)

    /**
     * 根据后缀文件类型
     */
    fun getFileTypeBySuffix(filePath: String) = filePath.getFileType()

}