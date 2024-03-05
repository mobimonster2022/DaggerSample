package com.mobimonsterit.daggersample

import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {
    @Provides
  fun getUserRepositoryModule() : IUserRepository
  {
      return FirebaseRepository()
  }
}