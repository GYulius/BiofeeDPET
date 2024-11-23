package ro.gilian.biofeed.domain

import io.reactivex.rxjava3.core.Single

class CreateUser {

        fun execute(): Single<BiofeedUserModel> {
            return Single.just(BiofeedUserModel())
        }
    }