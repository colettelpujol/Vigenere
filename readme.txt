This program reads in the ciphertext as a file, then converts it to a String, and then a character 
array. It then tests every possible shift. If a certain shift yields a greater count of matched 
characters than the previous saved keylength, it will be stored as the new keylength and printed 
out. You'll notice that after the keylength is found, the program will continue to print keylengths 
that are multiples of the actual keylength, so it is the user's responsibility to realize that the
keylength is the lowest multiple. The user is then prompted to enter the keylength, which dictates 
the size of the key array and how many times a frequency count is performed on the cyphertext.
Each time the frequency count is performed, the user is asked to enter the element of the key based 
on that frequency count. When the program has filled the array that represents the key, it will 
print it out as the key's numerical values. The program only gives the key, the message has to be
decrypted by hand. 

1st element of key:
highest frequency is f=10, so f=e and the shift is 1

2nd element of the key:
highest frequency is h=11, so h=e and the shift is 3

3rd element of the key:
highest frequencies are j=9 and s=9
if j=e then s=p
if s=e then j=v
it makes more sense for j=e because v should not occur in the text 9 times
so the shift is 5

4th element of the key:
the highest frequency is l=11, so l=e and the shift is 7

5th element of the key:
the highest frequency is n=9, so n=e and the shift is 9

Plaintext:

"When in the course of human events it becomes necessary for one people to dissolve the political 
bands which have connected them with another and to assume among the powers of the earth the 
separate and equal station to which the laws of nature and of natures god entitle them a decent 
respect to the opinions of mankind requires that they should declare the causes which impen(d) 
them to separate"