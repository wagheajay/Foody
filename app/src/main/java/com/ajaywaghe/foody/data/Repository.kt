package com.ajaywaghe.foody.data

import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class Repository @Inject constructor(

    //injecting remoteDataSource in Repository
    remoteDateSource: RemoteDateSource
) {

    val remote = remoteDateSource
}