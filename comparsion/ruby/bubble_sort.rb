def bubble_sort(array)

  if array.nil? || array.length == 0
    return []
  end
   #check the value of each element and compare them
   loop do
      #[1,3,1,5,2,7,3,4,5]
      #[1,1,3,5,2,7,3,4,5]
      #[1,1,3,2,5,7,3,4,5]
      #[1,1,3,2,5,3,7,4,5]
      #[1,1,2,3,3,5,7,4,5]
      #[1,1,2,3,3,5,4,7,5]
      #[1,1,2,3,3,4,5,7,5]
      #[1,1,2,3,3,4,5,5,7]
      swapped = false
      (array.length-1).times do |i|   #iterated index i
          if array[i] > array[i+1]
            array[i], array[i+1] = array[i+1],array[i]   #easier to swap compare to java
            swapped = true
          end
        end
        break if not swapped
      # totol number of array minus one
   end
   array
end


a = [1,3,5,3,5,7,8]
p bubble_sort(a)
