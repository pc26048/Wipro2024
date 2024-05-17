#Assignment 1: Ensure the script checks if a specific file (e.g., myfile.txt) exists in the current directory. If it exists, print "File exists", otherwise print "File not found".

file="myfile.txt"
if [ -e "$file" ]; then
	echo "file already exists"
else
	echo "file doesnt exists"
fi
