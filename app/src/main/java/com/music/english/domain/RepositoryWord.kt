package com.music.english.domain

interface RepositoryWord {

    fun addWord( word: Word)
    fun deleteWord(word: Word)
    fun editdWord(word: Word)
}