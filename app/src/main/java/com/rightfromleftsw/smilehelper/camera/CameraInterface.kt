package com.rightfromleftsw.smilehelper.camera

import android.view.View

interface CameraInterface {

  val layoutId: Int

  fun setupCamera(containerView: View)

  fun startCamera()
}