export enum BookType {
    HARDBACK,
    PAPERBACK
}

export class Book {
    private title: string;
    private author: string;
    private recommendedRetailPrice: number;
    private type: BookType;
    private monthsSincePublication: number;

    constructor(title: string, author: string) {
        this.title = title;
        this.author = author;
    }

    public getRecommendedRetailPrice(): number {
        return this.recommendedRetailPrice;
    }

    public setRecommendedRetailPrice(recommendedRetailPrice: number): void {
        this.recommendedRetailPrice = recommendedRetailPrice;
    }

    public getType(): BookType {
        return this.type;
    }

    public setType(type: BookType): void {
        this.type = type;
    }

    public getMonthsSincePublication(): number {
        return this.monthsSincePublication;
    }

    public setMonthsSincePublication(monthsSincePublication: number): void {
        this.monthsSincePublication = monthsSincePublication;
    }

    public getTitle(): string {
        return this.title;
    }

    public getAuthor(): string {
        return this.author;
    }
}
