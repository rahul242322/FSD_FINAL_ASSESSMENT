export interface BookResponses {
    data: Book[]
    message: string
  }
  
  export interface Book {
    id: number
    name: string
    author: string
    price: number
  }