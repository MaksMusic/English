package com.music.english.domain

class AddWordUseCase (private val repositoryWord: RepositoryWord){
   fun addWord(word: Word){
       repositoryWord.addWord(word)
   }
}