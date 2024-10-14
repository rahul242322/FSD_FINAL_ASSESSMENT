
  export interface HotelResponses {
    data: Hotel[]
    message: string
  }
  
  export interface Hotel {
    id: number
    name: string
    roomPrice: number
    imageUrl: string
    description: string
    rating: string
    city: string
    email: string
    wifi: string
    gym: string
    pool: string
  }