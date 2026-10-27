# Majority Element

## Problem Statement

Given an integer array `nums` of size `n`, find the element that appears more than `n / 2` times.

## Example

**Input:** `[7, 0, 0, 1, 7, 7, 2, 7, 7]`

**Output:** `7`

## Approach 1: Sorting

- **Intuition:** Sort the array so that equal elements appear consecutively.
- **Time Complexity:** O(n log n)
- **Space Complexity:** Depends on the sorting implementation.

## Approach 2: Moore's Voting Algorithm

- **Intuition:** Find a majority candidate using a running vote count.
- **Time Complexity:** O(n)
- **Auxiliary Space Complexity:** O(1)

## What I Learned

- How sorting simplifies an array problem.
- How to analyze time and space complexity.
- How to improve an approach from O(n log n) to O(n).

## Revision Notes

- The majority element occurs more than `n / 2` times.
- Moore's Voting Algorithm finds a candidate in linear time.
- Verify the candidate if the problem does not guarantee a majority element.
