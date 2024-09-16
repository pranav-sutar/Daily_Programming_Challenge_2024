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

