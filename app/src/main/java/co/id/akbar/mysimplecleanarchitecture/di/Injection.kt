package co.id.akbar.mysimplecleanarchitecture.di

import co.id.akbar.mysimplecleanarchitecture.data.IMessageDataSource
import co.id.akbar.mysimplecleanarchitecture.data.MessageDataSource
import co.id.akbar.mysimplecleanarchitecture.data.MessageRepository
import co.id.akbar.mysimplecleanarchitecture.domain.IMessageRepository
import co.id.akbar.mysimplecleanarchitecture.domain.MessageInteractor
import co.id.akbar.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}