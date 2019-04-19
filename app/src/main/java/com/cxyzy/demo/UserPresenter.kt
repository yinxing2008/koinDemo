package com.cxyzy.demo

class UserPresenter(val repo: UserRepo) {
    fun sayHi() = "Hi,${repo.getName()}"
}