package com.music.english.domain

class EditWordUseCase (private val repositoryWord: RepositoryWord){
    fun edit(word: Word){
        repositoryWord.editdWord(word)
    }
}