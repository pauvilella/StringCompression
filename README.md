# StringCompression
Exercise related with Arrays and Strings.

## Exercise Challenge
Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a-z).

### Solution
I just iterate through the string and count the number of consecutive of each letter. 
Then, when I have the character, and the number of consecutive of the same letters, I add both values to a StringBuilder, which is the compressed string. 
So I only go trough the string once, so this algorithm only takes O(N) runtime, which is the BCR also, which means it can't be better.
