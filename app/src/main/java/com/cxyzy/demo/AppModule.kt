package com.cxyzy.demo

import org.koin.dsl.module

val appModule = module {
    single<UserRepo> { UserRepoImpl() }
    factory { UserPresenter(get()) }
}