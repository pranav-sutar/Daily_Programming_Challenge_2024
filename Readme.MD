Daily programming challenge 2024 :
Question List: 
---------------------------------------------------------------
Day 1 of 30 🗓️

Problem: Sort an Array of 0s, 1s, and 2s
You are given an array arr consisting only of 0s, 1s, and 2s. The task is to sort the array in increasing order in linear time (i.e., O(n)) without using any extra space. This means you need to rearrange the array in-place.

Input :
An integer array arr of size n where each element is either 0, 1, or 2.
Example : arr = [0, 1, 2, 1, 0, 2, 1, 0]

Output :
The sorted array, arranged in increasing order of 0s, 1s, and 2s.
Example: [0, 0, 0, 1, 1, 1, 2, 2]

Detailed Problem Statement: 📄
https://docs.google.com/document/d/1zulQT5UscxDgFheelTx8luFiIl7jarUzpjIMcSWFOV0/edit?usp=sharing
---------------------------------------------------------------
Day 2 of 30 🗓️

Problem: Find the missing number
You are given an array arr containing n-1 distinct integers. The array consists of integers taken from the range 1 to n, meaning one integer is missing from this sequence. Your task is to find the missing integer.

Input :
An integer array arr of size n-1 where the elements are distinct and taken from the range 1 to n.
Example : arr = [1, 2, 4, 5]

Output :
Return the missing integer from the array.
Example: Missing Number : 3

Detailed Problem Statement: 📄
https://docs.google.com/document/d/1C5MrTIn13JTzcEGD5QnNK1jzPlXAcZJ_Q_uCpJOVUAI/edit?usp=sharing
---------------------------------------------------------------
Day 3 of 30 🗓️

Problem: Find the duplicate number
You are given an array arr containing n+1 integers, where each integer is in the range [1, n] inclusive. There is exactly one duplicate number in the array, but it may appear more than once. Your task is to find the duplicate number without modifying the array and using constant extra space.
Input :
An integer array arr of size n+1, where each element is an integer in the range [1, n].
Example : arr = [3, 1, 3, 4, 2]

Output :
Return the duplicate integer present in the array.
Example: Duplicate Number : 3

Detailed Problem Statement: 📄
https://docs.google.com/document/d/1MV-A97iJMh0Vr-JIhVOT5u59k4HWE8R-0gHept2FRFw/edit?usp=sharing
---------------------------------------------------------------
Day 4 of 30 🗓️

Problem : Merge Two Sorted Arrays
You are given two sorted arrays arr1 of size m and arr2 of size n. Your task is to merge these two arrays into a single sorted array without using any extra space (i.e., in-place merging). The elements in arr1 should be merged first, followed by the elements of arr2, resulting in both arrays being sorted after the merge.

Input :
Two sorted integer arrays arr1 of size m and arr2 of size n.
Example : 
arr1 = [1, 3, 5, 7]
arr2 = [2, 4, 6, 8]

Output :
Both arr1 and arr2 should be sorted after the merge. Since you cannot use extra space, the final result will be reflected in arr1 and arr2.
Example:
arr1 = [1, 2, 3, 4]
arr2 = [5, 6, 7, 8]

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1mgsQjvyyH3FkpW6T8OhlJs8ckhrWmLqkmI5jhhyKQek/edit?usp=sharing
---------------------------------------------------------------
Day 5 of 30 🗓️

Problem : Find the Leaders in an Array
You are given an integer array arr of size n. An element is considered a leader if it is greater than all the elements to its right. Your task is to find all such leader elements in the array.

Input :
An integer array arr of size n.
Example : 
arr = [16, 17, 4, 3, 5, 2]

Output :
Return an array containing all the leader elements in the order in which they appear in the original array.
Example:
Leaders: [17, 5, 2]

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1v1SHC2FKph3o5pac0OYMJUE-c3Lambu9sG6kX8U1scw/edit?usp=sharing
---------------------------------------------------------------
Day 6 of 30 🗓️

Problem : Find All Subarrays with Zero Sum
You are given an integer array arr of size n. Your task is to find all the subarrays whose elements sum up to zero. A subarray is defined as a contiguous part of the array, and you must return the starting and ending indices of each subarray.

Input :
An integer array arr of size n where n represents the number of elements in the array.
Example : 
Input: [1, 2, -3, 3, -1, 2]

Output :
- Return a list of tuples, where each tuple contains two integers. The starting index (0-based) of the subarray. The ending index (0-based) of the subarray.
- The output should list all subarrays that sum to zero. If no such subarrays are found, return an empty list.
Example
Output: [(0, 2), (1, 3)]


Detailed Problem Statement : 📄
https://docs.google.com/document/d/1PhtsKDIo14kjwsH5mS86m8oHC40xcKBMbZwqN6127HY/edit?usp=sharing
---------------------------------------------------------------
Day 7 of 30 🗓️

Problem : Trapping Rain Water
You are given an array height[] of non-negative integers where each element represents the height of a bar in a histogram-like structure. These bars are placed next to each other, and the width of each bar is 1 unit. When it rains, water gets trapped between the bars if there are taller bars on both the left and right of the shorter bars. The task is to calculate how much water can be trapped between these bars after the rain.

Input :
An integer array height[] where each element represents the height of a bar in the histogram.
Example : 
height[] = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]

Output :
* An integer representing the total units of water that can be trapped between the bars.
Example
Output: 6

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1I96Q-XbySvDCQaWnK8ZUZpsggWU8B7McCqp_PrIjwE4/edit?usp=sharing
---------------------------------------------------------------
Day 8 of 30 🗓️

Problem : Reverse a String Word by Word
You are given a string s that consists of multiple words separated by spaces. Your task is to reverse the order of the words in the string. Words are defined as sequences of non-space characters. The output string should not contain leading or trailing spaces, and multiple spaces between words should be reduced to a single space.

Input :
A string s of length n (1 ≤ n ≤ 10^4) consisting of letters, digits, punctuation, and spaces.
Example : "the sky is blue"

Output :
* A string where the words in s are reversed, with a single space separating the words, and no leading or trailing spaces.
Example: "blue is sky the"

Detailed Problem Statement : 📄
https://docs.google.com/document/d/13IzrCQA_ns6SJdwHDV1nIKo3-zCpPFn9b72sXWUyNDo/edit?usp=sharing
---------------------------------------------------------------
Day 9 of 30 🗓️

Problem : Longest Common Prefix
You are given an array of strings strs[], consisting of lowercase letters. Your task is to find the longest common prefix shared among all the strings. If there is no common prefix, return an empty string "".

Input :
An array of strings strs[] where each string consists of lowercase English letters.
Example: strs[] = ["flower", "flow", "flight"]

Output :
* A string representing the longest common prefix. If no common prefix exists, return an empty string "".
Example: "fl"

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1--O8LT-DTcSTxi9PTChSS9bHE-Ht-izLKWqEyeXaK30/edit?usp=sharing
---------------------------------------------------------------
Day 10 of 30 🗓️

Problem : Group Anagrams
You are given an array of strings strs[]. Your task is to group all the strings that are anagrams of each other. An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Input :
strs[] = ["eat", "tea", "tan", "ate", "nat", "bat"]

Output :
[["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1OU0WAba0tSedn4mO6mwAT6XcT4FSWIyA-q_AbmSNWXw/edit?usp=sharing
---------------------------------------------------------------
Day 11 of 30 🗓️

Problem : Permutations of a String
You are given a string s. Your task is to generate and return all possible permutations of the characters in the string. A permutation is a rearrangement of the characters in the string, and each character must appear exactly once in every permutation. If there are duplicate characters in the string, the resulting permutations should also be unique (i.e., no repeated permutations).

Input : "abc"

Output : ["abc", "acb", "bac", "bca", "cab", "cba"]

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1YMAR1kHq7TY_QbJMHVo9p0CnOtIcpeW4CypHK5DHHlg/edit?usp=sharing
---------------------------------------------------------------
Day 12 of 30 🗓️

Problem : Valid Parentheses with Multiple Types
You are given a string s consisting of different types of parentheses: (), {}, and []. Your task is to determine whether the given string is valid.

Input : s = "[{()}]"

Output : true

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1L2daffPK6gPK4nT2quqjc-Mk_2XoKgmKdMJgMUJiQ-0/edit?usp=sharing
---------------------------------------------------------------
Day 13 of 30 🗓️

Problem : Longest Palindromic Substring
You are given a string s. Your task is to find and return the longest palindromic substring within the given string. A palindrome is a string that reads the same forwards and backwards.

Input : "babad"

Output : "bab"

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1m2rDN4sSuVQLUHuHwYuMZ5fWWEcm6G_yBWcFa5MjzS4/edit?usp=sharing
---------------------------------------------------------------
Day 14 of 30 🗓️

Problem : Count Substrings with Exactly K Distinct Characters
You are given a string s of lowercase English alphabets and an integer k. Your task is to count all possible substrings of s that contain exactly k distinct characters.

Input : s = "pqpqs", k = 2

Output : 7

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1RAfx0tIlp_eldiEGe13AKi3vCJkkGDZg6GW0sy-gudA/edit?usp=sharing
---------------------------------------------------------------
Day 15 of 30 🗓️

Problem : Find the Longest Substring Without Repeating Characters
You are given a string S, and your task is to find the length of the longest substring that contains no repeating characters. A substring is a contiguous block of characters in the string.

Input : S = "abcabcbb"

Output : 3

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1PW2zGOhB7qmR5Qg3_WpZC382fuhIiXX84ZvSw85LOSs/edit?usp=sharing
---------------------------------------------------------------
Day 16 of 30 🗓️

Problem : LCM (Least Common Multiple) of Two Numbers
You are given two integers, N and M. Your task is to find the Least Common Multiple (LCM) of these two numbers. The LCM of two integers is the smallest positive integer that is divisible by both N and M.

Input : N = 4, M = 6

Output : 12

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1GIHFvwWlSYDOr72tmor2FIip3Y-249HPmL70L067N9U/edit?usp=sharing
---------------------------------------------------------------
Day 17 of 30 🗓️

Problem : Prime Factorization of a Number
Given a positive integer N, your task is to find its prime factorization. Return a list of prime numbers that multiply together to give N. If N is prime, the output should be a list containing only N.

Input : N = 18

Output : [2, 3, 3]

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1SuttUyXw9y0O9PXxnXmxmi7vqCOwjRTDIluc84ZE9g0/edit?usp=sharing
---------------------------------------------------------------
Day 18 of 30 🗓️

Problem : Count the Number of Divisors of a Number
Given a positive integer N, your task is to find the total number of divisors (factors) of N. A divisor of N is any integer that divides N without leaving a remainder.

Input : N = 12

Output : 6

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1_soWs6kVTFv2kKwZhHyEaX2Xldvxh-yAzR62-EzGuWw/edit?usp=sharing
---------------------------------------------------------------
Day 19 of 30 🗓️

Problem : Evaluate a Postfix Expression
Given a postfix expression (also known as Reverse Polish Notation), your task is to evaluate the expression and return the result. The expression can contain integers and the four basic arithmetic operators +, -, *, and /. Assume that the input is always valid and the division operator performs integer division, truncating towards zero.

Input : "2 1 + 3 *"

Output : 9

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1cF8hywCkas2VbnU-wGRgQL6eGQCKbFwI98RL7hrlfo8/edit?usp=sharing
---------------------------------------------------------------
Day 20 of 30 🗓️

Problem : Sort a Stack Using Recursion
Given a stack of integers, your task is to write a function that sorts the stack in ascending order. You are not allowed to use any additional data structure like arrays, lists, or another stack. The only operations you are allowed to perform are push, pop, and peek on the stack. The sorting must be performed using recursion only.

Input : [3, 1, 4, 2]

Output : [1, 2, 3, 4]

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1c8LgrDXZGmq5f9v88mK7ApZ60Lt2PBoccNHQAryzXQs/edit?usp=sharing
---------------------------------------------------------------
Day 21 of 30 🗓️

Problem : Reverse a Stack Using Recursion
You are given a stack of integers, and your task is to write a function that reverses the stack using recursion. You are not allowed to use any additional data structure (like arrays, lists, or another stack). The only operations you are allowed to perform are push, pop, and peek on the stack. The reversal must be done using recursion only.

Input : [3, 1, 4, 2]

Output : [2, 4, 1, 3]

Detailed Problem Statement : 📄
https://docs.google.com/document/d/18ibm5itlOTW_qtOYrrffNlrAzxs5_Slif2zRnuIQ-C0/edit?usp=sharing
---------------------------------------------------------------
Day 22 of 30 🗓️

Problem : First Element to Repeat k Times
You are given an array of integers and an integer k. Your task is to find the first element in the array that appears exactly k times. If no such element exists, return -1.

Input : arr = [3, 1, 4, 4, 5, 2, 6, 1, 4], k = 2

Output : 1

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1U8HYrbWQ-dqELzca6gp21KzKIQmOAle9iB_TojWgyao/edit?usp=sharing
---------------------------------------------------------------
Day 23 of 30 🗓️

Problem : Sliding Window Maximum
You are given an array of integers arr and a positive integer k. Your task is to find the maximum element in each sliding window of size k. The window slides from left to right, one element at a time, and you need to return the maximum element for each of these windows.

Input : arr = [1, 3, -1, -3, 5, 3, 6, 7], k = 3

Output : [3, 3, 5, 5, 6, 7]

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1b1AG8BIm7eZYqG1tlwh9ZQd6cQbkVzHfuWx0cCH2fOc/edit?usp=sharing
---------------------------------------------------------------
Day 24 of 30 🗓️

Problem : Lowest Common Ancestor (LCA) in a Binary Tree
You are given a binary tree and two distinct nodes within the tree. Your task is to find the lowest common ancestor (LCA) of these two nodes. The LCA of two nodes p and q is defined as the lowest node in the tree that has both p and q as descendants (where we allow a node to be a descendant of itself).

Input : root = [3, 5, 1, 6, 2, 0, 8, null, null, 7, 4], p = 5, q = 1

Output : 3

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1jl4cvWbHoiDwkWFsQ_EDnquM08338HShqH0WpI6cFEs/edit?usp=sharing
---------------------------------------------------------------
Day 25 of 30 🗓️

Problem : Check if a Binary Tree is a Binary Search Tree (BST)
You are given the root of a binary tree. Your task is to determine whether the tree is a valid Binary Search Tree (BST)

Input : root = [2, 1, 3]

Output : true

Detailed Problem Statement : 📄
https://docs.google.com/document/d/1w4uUd7Ha07D1Uagk52_G372posIDEl_c8MfY-_pgHxc/edit?usp=sharing
---------------------------------------------------------------
---------------------------------------------------------------
---------------------------------------------------------------
---------------------------------------------------------------

