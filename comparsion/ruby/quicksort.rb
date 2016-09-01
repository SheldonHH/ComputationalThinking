class Array
  def quicksort
      return [] if empty?
      #[34,2,1,5,3]
      pivot = delete_at(rand(size))
      left, right = partition(&pivot.method(:>))
      # if pivot is larger than the number,
      # then put the number on the left side of the pivot
      return *left.quicksort, pivot, *right.quicksort
      #delete at
  end
end

arr = [34,2,1,5,3]
p arr.quicksort
