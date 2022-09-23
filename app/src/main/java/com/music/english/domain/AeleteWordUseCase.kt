package com.music.english.domain

class AeleteWordUseCase (private val repositoryWord: RepositoryWord){
    fun deleteWord(word: Word){
        repositoryWord.deleteWord(word)
    }
}